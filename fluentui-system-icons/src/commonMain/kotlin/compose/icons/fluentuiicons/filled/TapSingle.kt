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

public val FilledGroup.TapSingle: ImageVector
    get() {
        if (_tapSingle != null) {
            return _tapSingle!!
        }
        _tapSingle = Builder(name = "TapSingle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7489f, 5.9998f)
                curveTo(13.1074f, 5.9998f, 13.7015f, 6.8984f, 13.7486f, 8.3256f)
                lineTo(13.7517f, 8.5147f)
                verticalLineTo(11.0011f)
                lineTo(16.6235f, 11.4233f)
                curveTo(16.7355f, 11.4398f, 16.8465f, 11.4631f, 16.9557f, 11.4933f)
                curveTo(18.3633f, 11.8821f, 19.2117f, 13.2974f, 18.9154f, 14.7071f)
                lineTo(18.8743f, 14.8762f)
                lineTo(17.6472f, 19.3188f)
                curveTo(17.4753f, 19.9413f, 16.9762f, 20.4144f, 16.3545f, 20.5579f)
                lineTo(16.209f, 20.5851f)
                lineTo(13.148f, 21.0243f)
                curveTo(12.3875f, 21.1335f, 11.6515f, 20.7341f, 11.3232f, 20.0523f)
                lineTo(11.263f, 19.9122f)
                lineTo(11.0464f, 19.3405f)
                curveTo(10.8003f, 18.6912f, 10.3952f, 18.1158f, 9.8698f, 17.6662f)
                lineTo(9.6672f, 17.5035f)
                lineTo(8.0705f, 16.3021f)
                curveTo(7.9869f, 16.2392f, 7.898f, 16.184f, 7.8047f, 16.1371f)
                lineTo(7.6618f, 16.073f)
                lineTo(5.4668f, 15.2052f)
                curveTo(5.1932f, 15.097f, 5.0081f, 14.8389f, 4.9935f, 14.5452f)
                curveTo(4.9573f, 13.8226f, 5.483f, 13.2989f, 6.4147f, 12.833f)
                curveTo(7.1339f, 12.4734f, 8.1422f, 12.5031f, 9.4808f, 12.8764f)
                lineTo(9.753f, 12.9557f)
                verticalLineTo(8.5056f)
                curveTo(9.753f, 6.9684f, 10.3313f, 5.9998f, 11.7489f, 5.9998f)
                close()
                moveTo(11.7489f, 2.5f)
                curveTo(14.9248f, 2.5f, 17.4994f, 5.0746f, 17.4994f, 8.2504f)
                curveTo(17.4994f, 9.0437f, 17.3387f, 9.7995f, 17.0482f, 10.487f)
                lineTo(17.2219f, 10.5294f)
                curveTo(17.073f, 10.4883f, 16.9217f, 10.4564f, 16.7689f, 10.4339f)
                lineTo(15.5016f, 10.2481f)
                curveTo(15.8193f, 9.6525f, 15.9994f, 8.9725f, 15.9994f, 8.2504f)
                curveTo(15.9994f, 5.903f, 14.0964f, 4.0f, 11.7489f, 4.0f)
                curveTo(9.4015f, 4.0f, 7.4985f, 5.903f, 7.4985f, 8.2504f)
                curveTo(7.4985f, 9.4291f, 7.9783f, 10.4957f, 8.7532f, 11.2657f)
                lineTo(8.753f, 11.6807f)
                curveTo(8.1393f, 11.5722f, 7.5848f, 11.5452f, 7.0812f, 11.6087f)
                curveTo(6.3998f, 10.6643f, 5.9985f, 9.5042f, 5.9985f, 8.2504f)
                curveTo(5.9985f, 5.0746f, 8.5731f, 2.5f, 11.7489f, 2.5f)
                close()
            }
        }
        .build()
        return _tapSingle!!
    }

private var _tapSingle: ImageVector? = null
