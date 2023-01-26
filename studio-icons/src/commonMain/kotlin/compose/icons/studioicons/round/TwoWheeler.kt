package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.TwoWheeler: ImageVector
    get() {
        if (_twoWheeler != null) {
            return _twoWheeler!!
        }
        _twoWheeler = Builder(name = "TwoWheeler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                curveToRelative(-0.18f, 0.0f, -0.36f, 0.03f, -0.53f, 0.05f)
                lineTo(17.41f, 9.0f)
                horizontalLineTo(19.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(7.62f)
                curveToRelative(0.0f, -0.74f, -0.78f, -1.23f, -1.45f, -0.89f)
                lineToRelative(-2.28f, 1.14f)
                lineToRelative(-2.57f, -2.57f)
                curveTo(13.52f, 5.11f, 13.26f, 5.0f, 13.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(9.45f, 5.0f, 9.0f, 5.45f, 9.0f, 6.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.17f)
                curveToRelative(0.27f, 0.0f, 0.52f, 0.11f, 0.71f, 0.29f)
                lineTo(14.59f, 9.0f)
                horizontalLineToRelative(-3.35f)
                curveToRelative(-0.16f, 0.0f, -0.31f, 0.04f, -0.45f, 0.11f)
                lineToRelative(-3.14f, 1.57f)
                curveToRelative(-0.38f, 0.19f, -0.85f, 0.12f, -1.15f, -0.19f)
                lineToRelative(-1.2f, -1.2f)
                curveTo(5.11f, 9.11f, 4.85f, 9.0f, 4.59f, 9.0f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(-2.52f, 0.0f, -4.49f, 2.32f, -3.89f, 4.94f)
                curveToRelative(0.33f, 1.45f, 1.5f, 2.62f, 2.95f, 2.95f)
                curveTo(5.68f, 19.49f, 8.0f, 17.52f, 8.0f, 15.0f)
                lineToRelative(1.41f, 1.41f)
                curveTo(9.79f, 16.79f, 10.3f, 17.0f, 10.83f, 17.0f)
                horizontalLineToRelative(1.01f)
                curveToRelative(0.72f, 0.0f, 1.38f, -0.38f, 1.74f, -1.01f)
                lineToRelative(2.91f, -5.09f)
                lineToRelative(1.01f, 1.01f)
                curveToRelative(-1.13f, 0.91f, -1.76f, 2.41f, -1.38f, 4.05f)
                curveToRelative(0.34f, 1.44f, 1.51f, 2.61f, 2.95f, 2.94f)
                curveTo(21.68f, 19.49f, 24.0f, 17.51f, 24.0f, 15.0f)
                curveTo(24.0f, 12.79f, 22.21f, 11.0f, 20.0f, 11.0f)
                close()
                moveTo(4.0f, 17.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveTo(6.0f, 16.1f, 5.1f, 17.0f, 4.0f, 17.0f)
                close()
                moveTo(20.0f, 17.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveTo(22.0f, 16.1f, 21.1f, 17.0f, 20.0f, 17.0f)
                close()
            }
        }
        .build()
        return _twoWheeler!!
    }

private var _twoWheeler: ImageVector? = null
