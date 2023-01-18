package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Fingerprint2Line: ImageVector
    get() {
        if (_fingerprint2Line != null) {
            return _fingerprint2Line!!
        }
        _fingerprint2Line = Builder(name = "Fingerprint2Line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, 9.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -12.092f, 8.455f)
                curveToRelative(0.128f, -0.177f, 0.251f, -0.357f, 0.369f, -0.542f)
                lineToRelative(0.17f, -0.28f)
                arcToRelative(10.918f, 10.918f, 0.0f, false, false, 1.55f, -5.345f)
                lineTo(11.0f, 16.0f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(12.96f, 12.96f, 0.0f, false, true, -0.997f, 5.001f)
                arcToRelative(7.026f, 7.026f, 0.0f, false, false, 2.27f, -0.378f)
                curveToRelative(0.442f, -1.361f, 0.693f, -2.808f, 0.724f, -4.31f)
                lineTo(15.0f, 16.0f)
                verticalLineToRelative(-3.001f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 16.0f)
                curveToRelative(0.0f, 1.088f, -0.102f, 2.153f, -0.298f, 3.185f)
                arcToRelative(6.978f, 6.978f, 0.0f, false, false, 2.294f, -4.944f)
                lineTo(19.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 7.808f, 4.394f)
                lineTo(6.383f, 2.968f)
                arcTo(8.962f, 8.962f, 0.0f, false, true, 12.0f, 1.0f)
                close()
                moveTo(7.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 10.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -5.995f, -0.176f)
                lineTo(9.0f, 10.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.567f, -0.4f, 3.04f, -1.104f, 4.323f)
                lineToRelative(-0.024f, 0.04f)
                curveToRelative(-0.23f, 0.414f, -0.491f, 0.808f, -0.782f, 1.179f)
                arcToRelative(9.03f, 9.03f, 0.0f, false, true, -1.237f, -0.97f)
                lineToRelative(-0.309f, -0.3f)
                arcTo(8.97f, 8.97f, 0.0f, false, true, 3.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.125f, 0.736f, -4.078f, 1.968f, -5.617f)
                lineToRelative(1.426f, 1.425f)
                arcToRelative(6.966f, 6.966f, 0.0f, false, false, -1.39f, 3.951f)
                lineTo(5.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.675f, 0.588f, 3.212f, 1.57f, 4.417f)
                arcToRelative(6.91f, 6.91f, 0.0f, false, false, 0.426f, -2.176f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _fingerprint2Line!!
    }

private var _fingerprint2Line: ImageVector? = null
