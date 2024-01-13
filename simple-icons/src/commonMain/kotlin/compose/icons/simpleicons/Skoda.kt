package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Skoda: ImageVector
    get() {
        if (_skoda != null) {
            return _skoda!!
        }
        _skoda = Builder(name = "Skoda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.3726f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.3726f, 12.0f, -12.0f)
                reflectiveCurveTo(18.6274f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.9636f)
                curveTo(5.945f, 22.9636f, 1.0364f, 18.055f, 1.0364f, 12.0f)
                curveTo(1.0364f, 5.945f, 5.945f, 1.0364f, 12.0f, 1.0364f)
                reflectiveCurveTo(22.9636f, 5.945f, 22.9636f, 12.0f)
                reflectiveCurveTo(18.055f, 22.9636f, 12.0f, 22.9636f)
                close()
                moveTo(17.189f, 15.7311f)
                lineTo(16.92f, 16.4574f)
                horizontalLineToRelative(-0.984f)
                curveToRelative(0.263f, -0.7089f, 3.5783f, -8.6177f, -2.9362f, -13.9819f)
                arcToRelative(9.5254f, 9.5254f, 0.0f, false, false, -4.0531f, 0.4483f)
                curveToRelative(0.2172f, 0.175f, 2.474f, 2.0276f, 3.5373f, 4.315f)
                lineToRelative(-0.312f, 0.084f)
                curveToRelative(-0.5861f, -0.6387f, -2.7156f, -2.9833f, -4.7448f, -3.7379f)
                arcToRelative(9.6184f, 9.6184f, 0.0f, false, false, -2.8448f, 2.3597f)
                curveToRelative(0.953f, 0.4875f, 3.4432f, 1.9748f, 4.3896f, 3.1302f)
                curveToRelative(-0.0542f, 0.0244f, -0.267f, 0.139f, -0.267f, 0.139f)
                curveToRelative(-1.736f, -1.3195f, -4.8199f, -2.0043f, -4.9775f, -2.0383f)
                arcToRelative(9.5126f, 9.5126f, 0.0f, false, false, -1.2267f, 3.6098f)
                curveToRelative(4.7759f, 0.9613f, 6.0618f, 3.1715f, 6.2818f, 5.6721f)
                lineTo(7.878f, 16.4574f)
                lineToRelative(-1.5545f, -0.6776f)
                arcToRelative(0.8563f, 0.8563f, 0.0f, false, false, -0.2524f, -0.0531f)
                lineTo(3.1767f, 15.7267f)
                arcToRelative(9.587f, 9.587f, 0.0f, false, false, 1.9267f, 2.9155f)
                horizontalLineToRelative(1.2334f)
                curveToRelative(0.1063f, 0.0f, 0.1993f, -0.0133f, 0.2923f, -0.0664f)
                lineToRelative(1.2489f, -0.6378f)
                horizontalLineToRelative(9.042f)
                lineToRelative(0.269f, 0.7264f)
                arcToRelative(4.8386f, 4.8386f, 0.0f, false, false, 2.9466f, -1.4667f)
                arcToRelative(4.839f, 4.839f, 0.0f, false, false, -2.9467f, -1.4666f)
                close()
                moveTo(13.049f, 15.1525f)
                arcToRelative(1.1863f, 1.1863f, 0.0f, false, true, -0.5038f, -1.2162f)
                arcToRelative(1.1862f, 1.1862f, 0.0f, false, true, 0.931f, -0.9309f)
                arcToRelative(1.1863f, 1.1863f, 0.0f, false, true, 1.2161f, 0.5038f)
                curveToRelative(0.3098f, 0.4636f, 0.2563f, 1.0924f, -0.1473f, 1.496f)
                curveToRelative(-0.4032f, 0.4032f, -1.0318f, 0.4574f, -1.496f, 0.1473f)
                close()
            }
        }
        .build()
        return _skoda!!
    }

private var _skoda: ImageVector? = null
