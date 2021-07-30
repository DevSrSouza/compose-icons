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

public val SimpleIcons.Slashdot: ImageVector
    get() {
        if (_slashdot != null) {
            return _slashdot!!
        }
        _slashdot = Builder(name = "Slashdot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.777f, 0.0f)
                lineTo(7.037f, 24.0f)
                lineTo(1.868f, 24.0f)
                lineTo(14.605f, 0.0f)
                horizontalLineToRelative(5.172f)
                close()
                moveTo(22.131f, 19.801f)
                curveToRelative(0.0f, 2.268f, -1.841f, 4.105f, -4.109f, 4.105f)
                reflectiveCurveToRelative(-4.107f, -1.838f, -4.107f, -4.105f)
                reflectiveCurveToRelative(1.839f, -4.107f, 4.107f, -4.107f)
                reflectiveCurveToRelative(4.109f, 1.839f, 4.109f, 4.107f)
                close()
            }
        }
        .build()
        return _slashdot!!
    }

private var _slashdot: ImageVector? = null
