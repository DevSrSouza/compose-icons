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

public val SimpleIcons.Quicktype: ImageVector
    get() {
        if (_quicktype != null) {
            return _quicktype!!
        }
        _quicktype = Builder(name = "Quicktype", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.226f, 14.393f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 0.612f, -0.804f)
                curveToRelative(0.538f, -1.032f, 0.365f, -2.246f, 0.047f, -2.983f)
                curveToRelative(-0.614f, -1.422f, -2.041f, -2.225f, -3.683f, -2.225f)
                curveToRelative(-1.497f, 0.0f, -2.427f, 0.64f, -2.868f, 1.048f)
                curveToRelative(-0.474f, 0.44f, -1.144f, 1.31f, -1.144f, 2.729f)
                curveToRelative(0.0f, 0.601f, 0.096f, 1.136f, 0.288f, 1.603f)
                curveToRelative(0.253f, 0.616f, 0.795f, 1.486f, 2.053f, 1.914f)
                arcToRelative(4.965f, 4.965f, 0.0f, false, false, 1.609f, 0.249f)
                horizontalLineToRelative(4.145f)
                curveToRelative(0.466f, 0.0f, 0.71f, -0.405f, 0.705f, -0.717f)
                arcToRelative(0.694f, 0.694f, 0.0f, false, false, -0.705f, -0.683f)
                lineToRelative(-0.29f, 0.005f)
                curveToRelative(-0.516f, 0.04f, -0.96f, 0.157f, -1.332f, 0.35f)
                lineToRelative(0.563f, -0.486f)
                close()
                moveTo(12.0f, 24.0f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.373f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(13.424f, 8.59f)
                arcToRelative(0.852f, 0.852f, 0.0f, false, false, 0.0f, 1.705f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.852f, 0.852f, 0.0f, true, false, 0.0f, -1.705f)
                close()
                moveTo(15.086f, 14.849f)
                curveToRelative(0.0f, 0.478f, 0.375f, 0.865f, 0.838f, 0.865f)
                arcToRelative(0.852f, 0.852f, 0.0f, false, false, 0.838f, -0.865f)
                lineTo(16.762f, 11.55f)
                curveToRelative(0.0f, -0.478f, -0.375f, -0.656f, -0.838f, -0.656f)
                curveToRelative(-0.463f, 0.0f, -0.838f, 0.178f, -0.838f, 0.656f)
                close()
                moveTo(10.135f, 13.086f)
                curveToRelative(-0.321f, 0.84f, -1.063f, 1.323f, -1.943f, 1.323f)
                curveToRelative(-0.875f, 0.0f, -1.612f, -0.468f, -1.928f, -1.323f)
                curveToRelative(-0.18f, -0.486f, -0.227f, -1.19f, 0.005f, -1.79f)
                arcToRelative(1.998f, 1.998f, 0.0f, false, true, 1.103f, -1.146f)
                curveToRelative(0.254f, -0.107f, 0.53f, -0.16f, 0.83f, -0.16f)
                curveToRelative(1.032f, 0.0f, 1.675f, 0.604f, 1.938f, 1.306f)
                arcToRelative(2.666f, 2.666f, 0.0f, false, true, -0.005f, 1.79f)
                close()
            }
        }
        .build()
        return _quicktype!!
    }

private var _quicktype: ImageVector? = null
