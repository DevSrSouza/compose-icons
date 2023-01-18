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

public val RemixIcons.LineFill: ImageVector
    get() {
        if (_lineFill != null) {
            return _lineFill!!
        }
        _lineFill = Builder(name = "LineFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.663f, 10.84f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, -0.526f, 0.525f)
                horizontalLineToRelative(-1.462f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1.462f)
                arcToRelative(0.525f, 0.525f, 0.0f, true, true, 0.0f, 1.049f)
                lineTo(16.15f, 13.352f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, -0.522f, -0.524f)
                lineTo(15.628f, 8.852f)
                curveToRelative(0.0f, -0.287f, 0.235f, -0.525f, 0.525f, -0.525f)
                horizontalLineToRelative(1.988f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, -0.003f, 1.05f)
                horizontalLineToRelative(-1.462f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1.462f)
                curveToRelative(0.291f, 0.0f, 0.526f, 0.237f, 0.526f, 0.525f)
                close()
                moveTo(14.565f, 13.325f)
                arcToRelative(0.538f, 0.538f, 0.0f, false, true, -0.166f, 0.025f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, true, -0.425f, -0.208f)
                lineToRelative(-2.036f, -2.764f)
                verticalLineToRelative(2.45f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, -1.047f, 0.0f)
                lineTo(10.891f, 8.852f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, true, 0.52f, -0.523f)
                curveToRelative(0.162f, 0.0f, 0.312f, 0.086f, 0.412f, 0.211f)
                lineToRelative(2.052f, 2.775f)
                lineTo(13.875f, 8.852f)
                curveToRelative(0.0f, -0.287f, 0.235f, -0.525f, 0.525f, -0.525f)
                curveToRelative(0.287f, 0.0f, 0.525f, 0.238f, 0.525f, 0.525f)
                verticalLineToRelative(3.976f)
                arcToRelative(0.524f, 0.524f, 0.0f, false, true, -0.36f, 0.497f)
                close()
                moveTo(9.615f, 13.352f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, -0.523f, -0.524f)
                lineTo(9.092f, 8.852f)
                curveToRelative(0.0f, -0.287f, 0.236f, -0.525f, 0.525f, -0.525f)
                curveToRelative(0.289f, 0.0f, 0.524f, 0.238f, 0.524f, 0.525f)
                verticalLineToRelative(3.976f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.526f, 0.524f)
                close()
                moveTo(8.085f, 13.352f)
                lineTo(6.098f, 13.352f)
                arcToRelative(0.528f, 0.528f, 0.0f, false, true, -0.525f, -0.524f)
                lineTo(5.573f, 8.852f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, 1.05f, 0.0f)
                verticalLineToRelative(3.45f)
                horizontalLineToRelative(1.464f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, 0.0f, 1.05f)
                close()
                moveTo(12.0f, 2.572f)
                curveToRelative(-5.513f, 0.0f, -10.0f, 3.643f, -10.0f, 8.118f)
                curveToRelative(0.0f, 4.01f, 3.558f, 7.369f, 8.363f, 8.007f)
                curveToRelative(0.325f, 0.068f, 0.769f, 0.215f, 0.881f, 0.492f)
                curveToRelative(0.1f, 0.25f, 0.066f, 0.638f, 0.032f, 0.9f)
                lineToRelative(-0.137f, 0.85f)
                curveToRelative(-0.037f, 0.25f, -0.2f, 0.988f, 0.874f, 0.537f)
                curveToRelative(1.076f, -0.449f, 5.764f, -3.398f, 7.864f, -5.812f)
                curveTo(21.313f, 14.089f, 22.0f, 12.477f, 22.0f, 10.69f)
                curveToRelative(0.0f, -4.475f, -4.488f, -8.118f, -10.0f, -8.118f)
                close()
            }
        }
        .build()
        return _lineFill!!
    }

private var _lineFill: ImageVector? = null
