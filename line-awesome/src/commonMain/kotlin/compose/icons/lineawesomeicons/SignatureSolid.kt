package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.SignatureSolid: ImageVector
    get() {
        if (_signatureSolid != null) {
            return _signatureSolid!!
        }
        _signatureSolid = Builder(name = "SignatureSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.313f, 4.0f)
                curveTo(8.559f, 4.0f, 7.906f, 4.367f, 7.313f, 4.875f)
                curveTo(6.719f, 5.383f, 6.172f, 6.066f, 5.688f, 6.938f)
                curveTo(4.719f, 8.684f, 4.0f, 11.133f, 4.0f, 14.188f)
                curveTo(4.0f, 15.754f, 4.363f, 17.367f, 5.094f, 18.656f)
                curveTo(5.254f, 18.938f, 5.516f, 19.125f, 5.719f, 19.375f)
                curveTo(5.176f, 20.039f, 4.281f, 21.281f, 4.281f, 21.281f)
                lineTo(5.719f, 22.719f)
                curveTo(5.719f, 22.719f, 6.711f, 21.352f, 7.344f, 20.594f)
                curveTo(7.746f, 20.766f, 8.125f, 21.0f, 8.594f, 21.0f)
                curveTo(10.309f, 21.0f, 12.098f, 20.25f, 13.75f, 19.313f)
                curveTo(14.281f, 19.719f, 14.879f, 20.0f, 15.5f, 20.0f)
                curveTo(17.555f, 20.0f, 19.117f, 18.793f, 20.219f, 17.719f)
                curveTo(20.539f, 17.406f, 20.754f, 17.176f, 21.0f, 16.906f)
                curveTo(20.996f, 17.18f, 20.988f, 17.43f, 21.063f, 17.75f)
                curveTo(21.121f, 17.992f, 21.188f, 18.293f, 21.438f, 18.563f)
                curveTo(21.688f, 18.832f, 22.137f, 19.0f, 22.5f, 19.0f)
                curveTo(23.23f, 19.0f, 23.652f, 18.664f, 24.094f, 18.344f)
                curveTo(24.535f, 18.023f, 24.953f, 17.641f, 25.406f, 17.281f)
                curveTo(26.316f, 16.563f, 27.285f, 16.0f, 28.0f, 16.0f)
                lineTo(28.0f, 14.0f)
                curveTo(26.414f, 14.0f, 25.176f, 14.938f, 24.188f, 15.719f)
                curveTo(23.719f, 16.09f, 23.297f, 16.414f, 22.969f, 16.656f)
                curveTo(22.969f, 16.602f, 22.969f, 16.59f, 22.969f, 16.531f)
                curveTo(22.98f, 16.168f, 23.035f, 15.762f, 22.969f, 15.313f)
                curveTo(22.938f, 15.09f, 22.863f, 14.855f, 22.656f, 14.563f)
                curveTo(22.449f, 14.27f, 21.984f, 14.0f, 21.594f, 14.0f)
                curveTo(21.031f, 14.0f, 20.824f, 14.242f, 20.625f, 14.406f)
                curveTo(20.426f, 14.57f, 20.277f, 14.738f, 20.094f, 14.938f)
                curveTo(19.727f, 15.336f, 19.289f, 15.816f, 18.813f, 16.281f)
                curveTo(17.973f, 17.102f, 16.984f, 17.723f, 15.906f, 17.875f)
                curveTo(16.621f, 17.301f, 17.34f, 16.73f, 17.844f, 16.094f)
                curveTo(18.508f, 15.258f, 19.0f, 14.406f, 19.0f, 13.406f)
                curveTo(19.0f, 12.844f, 18.93f, 12.074f, 18.5f, 11.344f)
                curveTo(18.07f, 10.613f, 17.145f, 10.0f, 16.0f, 10.0f)
                curveTo(14.77f, 10.0f, 13.648f, 10.605f, 12.969f, 11.563f)
                curveTo(12.289f, 12.52f, 12.0f, 13.746f, 12.0f, 15.188f)
                curveTo(12.0f, 16.168f, 12.223f, 16.98f, 12.531f, 17.688f)
                curveTo(11.141f, 18.418f, 9.699f, 19.0f, 8.594f, 19.0f)
                curveTo(10.285f, 16.465f, 12.0f, 13.012f, 12.0f, 8.813f)
                curveTo(12.0f, 7.941f, 12.008f, 6.914f, 11.719f, 5.969f)
                curveTo(11.574f, 5.496f, 11.344f, 5.016f, 10.938f, 4.625f)
                curveTo(10.531f, 4.234f, 9.93f, 4.0f, 9.313f, 4.0f)
                close()
                moveTo(9.313f, 6.0f)
                curveTo(9.492f, 6.0f, 9.5f, 6.035f, 9.563f, 6.094f)
                curveTo(9.625f, 6.152f, 9.699f, 6.297f, 9.781f, 6.563f)
                curveTo(9.941f, 7.09f, 10.0f, 7.98f, 10.0f, 8.813f)
                curveTo(10.0f, 12.355f, 8.484f, 15.457f, 6.969f, 17.781f)
                curveTo(6.934f, 17.723f, 6.879f, 17.719f, 6.844f, 17.656f)
                curveTo(6.324f, 16.746f, 6.0f, 15.422f, 6.0f, 14.188f)
                curveTo(6.0f, 11.441f, 6.656f, 9.313f, 7.438f, 7.906f)
                curveTo(7.828f, 7.203f, 8.23f, 6.688f, 8.594f, 6.375f)
                curveTo(8.957f, 6.063f, 9.266f, 6.0f, 9.313f, 6.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(16.555f, 12.0f, 16.637f, 12.133f, 16.781f, 12.375f)
                curveTo(16.926f, 12.617f, 17.0f, 13.066f, 17.0f, 13.406f)
                curveTo(17.0f, 13.656f, 16.789f, 14.238f, 16.281f, 14.875f)
                curveTo(15.84f, 15.43f, 15.168f, 16.004f, 14.438f, 16.563f)
                curveTo(14.262f, 16.16f, 14.0f, 15.867f, 14.0f, 15.188f)
                curveTo(14.0f, 14.027f, 14.246f, 13.18f, 14.594f, 12.688f)
                curveTo(14.941f, 12.195f, 15.332f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(4.0f, 26.0f)
                lineTo(4.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 26.0f)
                close()
            }
        }
        .build()
        return _signatureSolid!!
    }

private var _signatureSolid: ImageVector? = null
