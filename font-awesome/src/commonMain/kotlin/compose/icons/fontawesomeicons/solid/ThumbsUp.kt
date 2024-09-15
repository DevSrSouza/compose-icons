package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 224.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineTo(248.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(64.0f, 472.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, -10.74f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.74f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.74f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.74f, 24.0f, -24.0f, 24.0f)
                close()
                moveTo(384.0f, 81.45f)
                curveToRelative(0.0f, 42.42f, -25.97f, 66.21f, -33.28f, 94.55f)
                horizontalLineToRelative(101.72f)
                curveToRelative(33.4f, 0.0f, 59.4f, 27.75f, 59.55f, 58.1f)
                curveToRelative(0.08f, 17.94f, -7.55f, 37.25f, -19.44f, 49.2f)
                lineToRelative(-0.11f, 0.11f)
                curveToRelative(9.84f, 23.34f, 8.24f, 56.04f, -9.31f, 79.47f)
                curveToRelative(8.68f, 25.9f, -0.07f, 57.7f, -16.38f, 74.76f)
                curveToRelative(4.3f, 17.6f, 2.24f, 32.58f, -6.15f, 44.63f)
                curveTo(440.2f, 511.59f, 389.62f, 512.0f, 346.84f, 512.0f)
                lineToRelative(-2.85f, -0.0f)
                curveToRelative(-48.29f, -0.02f, -87.81f, -17.6f, -119.56f, -31.73f)
                curveToRelative(-15.96f, -7.1f, -36.82f, -15.89f, -52.65f, -16.18f)
                curveToRelative(-6.54f, -0.12f, -11.78f, -5.46f, -11.78f, -12.0f)
                verticalLineToRelative(-213.77f)
                curveToRelative(0.0f, -3.2f, 1.28f, -6.27f, 3.56f, -8.52f)
                curveToRelative(39.61f, -39.14f, 56.65f, -80.59f, 89.12f, -113.11f)
                curveToRelative(14.8f, -14.83f, 20.19f, -37.24f, 25.39f, -58.9f)
                curveTo(282.52f, 39.29f, 291.82f, 0.0f, 312.0f, 0.0f)
                curveToRelative(24.0f, 0.0f, 72.0f, 8.0f, 72.0f, 81.45f)
                close()
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
