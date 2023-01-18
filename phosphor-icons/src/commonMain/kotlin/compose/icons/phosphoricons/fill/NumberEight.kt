package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.NumberEight: ImageVector
    get() {
        if (_numberEight != null) {
            return _numberEight!!
        }
        _numberEight = Builder(name = "NumberEight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(175.9f, 130.0f)
                arcToRelative(68.8f, 68.8f, 0.0f, false, false, -16.4f, -11.4f)
                arcToRelative(59.4f, 59.4f, 0.0f, false, false, 9.9f, -7.4f)
                arcToRelative(53.6f, 53.6f, 0.0f, false, false, 0.0f, -79.1f)
                arcToRelative(61.3f, 61.3f, 0.0f, false, false, -82.8f, 0.0f)
                arcToRelative(53.6f, 53.6f, 0.0f, false, false, 0.0f, 79.1f)
                arcToRelative(59.4f, 59.4f, 0.0f, false, false, 9.9f, 7.4f)
                arcTo(68.8f, 68.8f, 0.0f, false, false, 80.1f, 130.0f)
                arcToRelative(61.9f, 61.9f, 0.0f, false, false, 0.0f, 91.3f)
                arcToRelative(70.7f, 70.7f, 0.0f, false, false, 95.8f, 0.0f)
                arcToRelative(61.9f, 61.9f, 0.0f, false, false, 0.0f, -91.3f)
                close()
                moveTo(97.6f, 99.5f)
                arcToRelative(37.5f, 37.5f, 0.0f, false, true, 0.0f, -55.7f)
                arcToRelative(45.1f, 45.1f, 0.0f, false, true, 60.8f, 0.0f)
                arcToRelative(37.5f, 37.5f, 0.0f, false, true, 0.0f, 55.7f)
                arcToRelative(45.1f, 45.1f, 0.0f, false, true, -60.8f, 0.0f)
                close()
                moveTo(165.0f, 209.7f)
                arcToRelative(55.0f, 55.0f, 0.0f, false, true, -74.0f, 0.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 0.0f, -68.0f)
                arcToRelative(54.7f, 54.7f, 0.0f, false, true, 74.0f, 0.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 0.0f, 68.0f)
                close()
            }
        }
        .build()
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
