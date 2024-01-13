package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.SignatureOff: ImageVector
    get() {
        if (_signatureOff != null) {
            return _signatureOff!!
        }
        _signatureOff = Builder(name = "SignatureOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                curveToRelative(3.333f, -3.333f, 5.0f, -6.0f, 5.0f, -8.0f)
                curveToRelative(0.0f, -0.394f, -0.017f, -0.735f, -0.05f, -1.033f)
                moveToRelative(-1.95f, -1.967f)
                curveToRelative(-1.0f, 0.0f, -2.032f, 1.085f, -2.0f, 3.0f)
                curveToRelative(0.034f, 2.048f, 1.658f, 4.877f, 2.5f, 6.0f)
                curveToRelative(1.5f, 2.0f, 2.5f, 2.5f, 3.5f, 1.0f)
                lineToRelative(2.0f, -3.0f)
                curveToRelative(0.333f, 2.667f, 1.333f, 4.0f, 3.0f, 4.0f)
                curveToRelative(0.219f, 0.0f, 0.708f, -0.341f, 1.231f, -0.742f)
                moveToRelative(3.769f, -0.258f)
                curveToRelative(0.303f, 0.245f, 0.64f, 0.677f, 1.0f, 1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _signatureOff!!
    }

private var _signatureOff: ImageVector? = null
