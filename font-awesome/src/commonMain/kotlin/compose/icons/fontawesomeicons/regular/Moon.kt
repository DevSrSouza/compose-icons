package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(279.14f, 512.0f)
                curveToRelative(78.76f, 0.0f, 150.98f, -35.8f, 198.84f, -94.78f)
                curveToRelative(28.27f, -34.83f, -2.56f, -85.72f, -46.25f, -77.4f)
                curveToRelative(-82.35f, 15.68f, -158.27f, -47.27f, -158.27f, -130.79f)
                curveToRelative(0.0f, -48.42f, 26.06f, -92.29f, 67.43f, -115.84f)
                curveToRelative(38.74f, -22.05f, 29.0f, -80.79f, -15.02f, -88.92f)
                arcTo(257.94f, 257.94f, 0.0f, false, false, 279.14f, 0.0f)
                curveToRelative(-141.36f, 0.0f, -256.0f, 114.57f, -256.0f, 256.0f)
                curveToRelative(0.0f, 141.36f, 114.58f, 256.0f, 256.0f, 256.0f)
                close()
                moveTo(279.14f, 48.0f)
                curveToRelative(12.98f, 0.0f, 25.69f, 1.2f, 38.02f, 3.48f)
                curveToRelative(-54.76f, 31.16f, -91.69f, 90.04f, -91.69f, 157.55f)
                curveToRelative(0.0f, 113.85f, 103.64f, 199.2f, 215.25f, 177.94f)
                curveTo(402.57f, 433.96f, 344.37f, 464.0f, 279.14f, 464.0f)
                curveToRelative(-114.88f, 0.0f, -208.0f, -93.13f, -208.0f, -208.0f)
                reflectiveCurveToRelative(93.13f, -208.0f, 208.0f, -208.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
