package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.DinnerDining: ImageVector
    get() {
        if (_dinnerDining != null) {
            return _dinnerDining!!
        }
        _dinnerDining = Builder(name = "DinnerDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 19.0f)
                horizontalLineToRelative(20.0f)
                lineToRelative(-2.0f, 2.0f)
                horizontalLineTo(4.0f)
                lineTo(2.0f, 19.0f)
                close()
                moveTo(5.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(9.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(9.0f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(6.0f, 15.23f)
                curveToRelative(-0.36f, 0.11f, -0.69f, 0.28f, -1.0f, 0.47f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(15.23f)
                close()
                moveTo(4.0f, 16.52f)
                curveTo(3.62f, 16.96f, 3.32f, 17.45f, 3.16f, 18.0f)
                horizontalLineToRelative(16.82f)
                curveToRelative(0.01f, -0.16f, 0.03f, -0.33f, 0.03f, -0.5f)
                curveToRelative(0.0f, -3.04f, -2.46f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-2.29f, 0.0f, -4.25f, 1.4f, -5.08f, 3.4f)
                curveTo(8.84f, 15.15f, 8.19f, 15.0f, 7.5f, 15.0f)
                curveToRelative(-0.17f, 0.0f, -0.33f, 0.02f, -0.5f, 0.04f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.03f, 0.06f, 1.9f, -0.96f, 2.0f, -2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                curveToRelative(-0.1f, -1.05f, -0.97f, -1.97f, -2.0f, -2.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(16.52f)
                close()
            }
        }
        .build()
        return _dinnerDining!!
    }

private var _dinnerDining: ImageVector? = null
