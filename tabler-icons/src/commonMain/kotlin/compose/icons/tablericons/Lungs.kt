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

public val TablerIcons.Lungs: ImageVector
    get() {
        if (_lungs != null) {
            return _lungs!!
        }
        _lungs = Builder(name = "Lungs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.081f, 20.0f)
                curveToRelative(1.612f, 0.0f, 2.919f, -1.335f, 2.919f, -2.98f)
                verticalLineToRelative(-9.763f)
                curveToRelative(0.0f, -0.694f, -0.552f, -1.257f, -1.232f, -1.257f)
                curveToRelative(-0.205f, 0.0f, -0.405f, 0.052f, -0.584f, 0.15f)
                lineToRelative(-0.13f, 0.083f)
                curveToRelative(-1.46f, 1.059f, -2.432f, 2.647f, -3.404f, 5.824f)
                curveToRelative(-0.42f, 1.37f, -0.636f, 2.962f, -0.648f, 4.775f)
                curveToRelative(-0.012f, 1.675f, 1.261f, 3.054f, 2.877f, 3.161f)
                lineToRelative(0.203f, 0.007f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.92f, 20.0f)
                curveToRelative(-1.613f, 0.0f, -2.92f, -1.335f, -2.92f, -2.98f)
                verticalLineToRelative(-9.763f)
                curveToRelative(0.0f, -0.694f, 0.552f, -1.257f, 1.233f, -1.257f)
                curveToRelative(0.204f, 0.0f, 0.405f, 0.052f, 0.584f, 0.15f)
                lineToRelative(0.13f, 0.083f)
                curveToRelative(1.46f, 1.059f, 2.432f, 2.647f, 3.405f, 5.824f)
                curveToRelative(0.42f, 1.37f, 0.636f, 2.962f, 0.648f, 4.775f)
                curveToRelative(0.012f, 1.675f, -1.261f, 3.054f, -2.878f, 3.161f)
                lineToRelative(-0.202f, 0.007f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                verticalLineToRelative(5.0f)
            }
        }
        .build()
        return _lungs!!
    }

private var _lungs: ImageVector? = null
