package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.EditOff: ImageVector
    get() {
        if (_editOff != null) {
            return _editOff!!
        }
        _editOff = Builder(name = "EditOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9397f, 10.0005f)
                lineTo(2.2197f, 3.2803f)
                curveTo(1.9268f, 2.9874f, 1.9268f, 2.5126f, 2.2197f, 2.2197f)
                curveTo(2.5126f, 1.9268f, 2.9874f, 1.9268f, 3.2803f, 2.2197f)
                lineTo(21.7801f, 20.7198f)
                curveTo(22.073f, 21.0127f, 22.073f, 21.4876f, 21.7801f, 21.7805f)
                curveTo(21.4872f, 22.0734f, 21.0123f, 22.0734f, 20.7194f, 21.7805f)
                lineTo(14.0003f, 15.0612f)
                lineTo(9.0019f, 20.0601f)
                curveTo(8.5955f, 20.4666f, 8.0842f, 20.7523f, 7.525f, 20.8855f)
                lineTo(2.9237f, 21.981f)
                curveTo(2.6704f, 22.0413f, 2.4039f, 21.9659f, 2.2197f, 21.7817f)
                curveTo(2.0355f, 21.5976f, 1.9601f, 21.3311f, 2.0204f, 21.0777f)
                lineTo(3.116f, 16.4762f)
                curveTo(3.2491f, 15.9172f, 3.5347f, 15.4061f, 3.941f, 14.9997f)
                lineTo(8.9397f, 10.0005f)
                close()
                moveTo(12.9396f, 14.0005f)
                lineTo(10.0003f, 11.0611f)
                lineTo(5.0017f, 16.0603f)
                curveTo(4.7917f, 16.2704f, 4.644f, 16.5346f, 4.5752f, 16.8237f)
                lineTo(3.7619f, 20.2395f)
                lineTo(7.1775f, 19.4263f)
                curveTo(7.4667f, 19.3574f, 7.731f, 19.2097f, 7.9412f, 18.9995f)
                lineTo(12.9396f, 14.0005f)
                close()
                moveTo(17.9394f, 9.0002f)
                lineTo(15.0606f, 11.8792f)
                lineTo(16.1213f, 12.9399f)
                lineTo(20.952f, 8.1086f)
                curveTo(22.3493f, 6.7111f, 22.3493f, 4.4455f, 20.9519f, 3.0481f)
                curveTo(19.5543f, 1.6506f, 17.2885f, 1.6506f, 15.8911f, 3.0482f)
                lineTo(11.0607f, 7.8792f)
                lineTo(12.1213f, 8.9399f)
                lineTo(15.0f, 6.0608f)
                lineTo(17.9394f, 9.0002f)
                close()
                moveTo(16.9518f, 4.1088f)
                curveTo(17.7634f, 3.2971f, 19.0795f, 3.297f, 19.8912f, 4.1088f)
                curveTo(20.7028f, 4.9204f, 20.7029f, 6.2363f, 19.8913f, 7.048f)
                lineTo(19.0f, 7.9395f)
                lineTo(16.0606f, 5.0001f)
                lineTo(16.9518f, 4.1088f)
                close()
            }
        }
        .build()
        return _editOff!!
    }

private var _editOff: ImageVector? = null
