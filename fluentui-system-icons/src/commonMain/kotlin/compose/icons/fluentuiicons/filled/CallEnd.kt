package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.CallEnd: ImageVector
    get() {
        if (_callEnd != null) {
            return _callEnd!!
        }
        _callEnd = Builder(name = "CallEnd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9491f, 12.9921f)
                lineTo(21.7518f, 14.0287f)
                curveTo(21.5669f, 15.0f, 20.6593f, 15.6523f, 19.631f, 15.5529f)
                lineTo(17.5846f, 15.3552f)
                curveTo(16.6928f, 15.269f, 15.933f, 14.6356f, 15.7061f, 13.7892f)
                lineTo(15.0748f, 11.434f)
                curveTo(14.1403f, 11.0508f, 13.1104f, 10.8756f, 11.985f, 10.9085f)
                curveTo(10.8596f, 10.9414f, 9.8128f, 11.1773f, 8.8446f, 11.6161f)
                lineTo(8.4535f, 13.8209f)
                curveTo(8.3053f, 14.6566f, 7.6157f, 15.2799f, 6.7424f, 15.3677f)
                lineTo(4.7079f, 15.5723f)
                curveTo(3.6927f, 15.6744f, 2.7194f, 15.0284f, 2.4308f, 14.0611f)
                lineTo(2.1215f, 13.0245f)
                curveTo(1.8137f, 11.9927f, 2.0884f, 10.9068f, 2.8427f, 10.1739f)
                curveTo(4.6235f, 8.4436f, 7.5925f, 7.5757f, 11.7498f, 7.5703f)
                curveTo(15.9131f, 7.565f, 18.9745f, 8.4275f, 20.9341f, 10.158f)
                curveTo(21.7587f, 10.8862f, 22.1448f, 11.9643f, 21.9491f, 12.9921f)
                close()
            }
        }
        .build()
        return _callEnd!!
    }

private var _callEnd: ImageVector? = null
