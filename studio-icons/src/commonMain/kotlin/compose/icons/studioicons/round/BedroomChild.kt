package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.BedroomChild: ImageVector
    get() {
        if (_bedroomChild != null) {
            return _bedroomChild!!
        }
        _bedroomChild = Builder(name = "BedroomChild", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 8.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.64f, 12.0f)
                horizontalLineTo(8.37f)
                curveToRelative(-0.48f, 0.0f, -0.87f, 0.39f, -0.87f, 0.87f)
                horizontalLineToRelative(0.01f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.13f)
                curveTo(16.51f, 12.39f, 16.12f, 12.0f, 15.64f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(17.25f, 17.0f)
                lineTo(17.25f, 17.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(15.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(0.75f)
                curveTo(7.5f, 16.66f, 7.16f, 17.0f, 6.75f, 17.0f)
                horizontalLineToRelative(0.0f)
                curveTo(6.34f, 17.0f, 6.0f, 16.66f, 6.0f, 16.25f)
                verticalLineToRelative(-3.38f)
                curveToRelative(0.0f, -1.0f, 0.62f, -1.85f, 1.5f, -2.2f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(1.67f)
                curveToRelative(0.88f, 0.35f, 1.5f, 1.2f, 1.5f, 2.2f)
                verticalLineToRelative(3.38f)
                curveTo(18.0f, 16.66f, 17.66f, 17.0f, 17.25f, 17.0f)
                close()
            }
        }
        .build()
        return _bedroomChild!!
    }

private var _bedroomChild: ImageVector? = null
