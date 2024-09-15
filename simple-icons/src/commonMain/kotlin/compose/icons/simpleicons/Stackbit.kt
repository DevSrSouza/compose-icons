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

public val SimpleIcons.Stackbit: ImageVector
    get() {
        if (_stackbit != null) {
            return _stackbit!!
        }
        _stackbit = Builder(name = "Stackbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.949f, 2.306f)
                lineTo(1.171f, 7.967f)
                curveToRelative(-0.784f, 0.449f, -1.238f, 1.326f, -1.162f, 2.242f)
                verticalLineToRelative(3.774f)
                curveToRelative(-0.066f, 0.928f, 0.406f, 1.808f, 1.207f, 2.25f)
                lineToRelative(9.778f, 5.472f)
                arcToRelative(2.261f, 2.261f, 0.0f, false, false, 2.23f, 0.0f)
                lineToRelative(9.594f, -5.472f)
                curveToRelative(0.788f, -0.45f, 1.248f, -1.329f, 1.175f, -2.25f)
                verticalLineToRelative(-3.774f)
                curveToRelative(0.068f, -0.912f, -0.385f, -1.782f, -1.162f, -2.233f)
                lineToRelative(-9.594f, -5.661f)
                arcTo(2.265f, 2.265f, 0.0f, false, false, 12.085f, 2.0f)
                curveToRelative(-0.392f, 0.0f, -0.783f, 0.102f, -1.136f, 0.306f)
                close()
                moveTo(11.724f, 16.343f)
                lineToRelative(-9.778f, -5.661f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, true, -0.288f, -0.295f)
                curveToRelative(-0.197f, -0.365f, -0.068f, -0.824f, 0.288f, -1.026f)
                lineToRelative(9.778f, -5.661f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, true, 0.738f, 0.0f)
                lineToRelative(9.594f, 5.675f)
                curveToRelative(0.353f, 0.209f, 0.474f, 0.67f, 0.27f, 1.031f)
                curveToRelative(-0.204f, 0.361f, -0.655f, 0.485f, -1.008f, 0.276f)
                lineToRelative(-9.228f, -5.452f)
                lineToRelative(-8.276f, 4.792f)
                lineToRelative(8.638f, 5.001f)
                curveToRelative(0.357f, 0.205f, 0.483f, 0.668f, 0.282f, 1.032f)
                curveToRelative(-0.136f, 0.248f, -0.387f, 0.387f, -0.646f, 0.387f)
                arcToRelative(0.727f, 0.727f, 0.0f, false, true, -0.363f, -0.098f)
                close()
                moveTo(11.738f, 20.306f)
                lineTo(1.96f, 14.833f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, true, -0.082f, -0.046f)
                curveToRelative(-0.344f, -0.223f, -0.447f, -0.69f, -0.228f, -1.042f)
                curveToRelative(0.218f, -0.352f, 0.674f, -0.457f, 1.018f, -0.233f)
                lineToRelative(9.42f, 5.271f)
                lineToRelative(9.238f, -5.271f)
                curveToRelative(0.357f, -0.203f, 0.807f, -0.072f, 1.005f, 0.292f)
                curveToRelative(0.199f, 0.365f, 0.071f, 0.825f, -0.286f, 1.028f)
                lineToRelative(-9.594f, 5.473f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, true, -0.714f, 0.0f)
                close()
            }
        }
        .build()
        return _stackbit!!
    }

private var _stackbit: ImageVector? = null
