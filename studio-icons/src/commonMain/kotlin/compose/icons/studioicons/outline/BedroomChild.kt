package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.BedroomChild: ImageVector
    get() {
        if (_bedroomChild != null) {
            return _bedroomChild!!
        }
        _bedroomChild = Builder(name = "BedroomChild", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                close()
                moveTo(16.5f, 10.67f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(1.67f)
                curveToRelative(-0.88f, 0.35f, -1.5f, 1.2f, -1.5f, 2.2f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(-4.13f)
                curveTo(18.0f, 11.87f, 17.38f, 11.02f, 16.5f, 10.67f)
                close()
                moveTo(15.0f, 8.5f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(7.5f, 12.87f)
                curveTo(7.5f, 12.39f, 7.89f, 12.0f, 8.37f, 12.0f)
                horizontalLineToRelative(7.27f)
                curveToRelative(0.48f, 0.0f, 0.87f, 0.39f, 0.87f, 0.87f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.13f)
                horizontalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _bedroomChild!!
    }

private var _bedroomChild: ImageVector? = null
