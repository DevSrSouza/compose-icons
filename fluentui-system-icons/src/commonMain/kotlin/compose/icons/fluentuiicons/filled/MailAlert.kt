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

public val FilledGroup.MailAlert: ImageVector
    get() {
        if (_mailAlert != null) {
            return _mailAlert!!
        }
        _mailAlert = Builder(name = "MailAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5025f, 1.0f)
                curveTo(15.2934f, 1.0f, 13.5025f, 2.7909f, 13.5025f, 5.0f)
                lineTo(13.5023f, 8.0f)
                lineTo(12.5539f, 8.8004f)
                curveTo(12.2462f, 9.06f, 12.0923f, 9.1899f, 12.0457f, 9.2913f)
                curveTo(11.9312f, 9.5407f, 12.0391f, 9.8358f, 12.2875f, 9.9525f)
                curveTo(12.3885f, 10.0f, 12.5898f, 10.0f, 12.9925f, 10.0f)
                horizontalLineTo(22.0121f)
                curveTo(22.4148f, 10.0f, 22.6162f, 10.0f, 22.7172f, 9.9525f)
                curveTo(22.9656f, 9.8358f, 23.0735f, 9.5407f, 22.9589f, 9.2913f)
                curveTo(22.9123f, 9.1899f, 22.7584f, 9.06f, 22.4507f, 8.8003f)
                lineTo(21.5025f, 8.0f)
                verticalLineTo(5.0f)
                curveTo(21.5025f, 2.7909f, 19.7116f, 1.0f, 17.5025f, 1.0f)
                close()
                moveTo(19.0025f, 11.0f)
                curveTo(18.7842f, 11.5826f, 18.195f, 12.0f, 17.5025f, 12.0f)
                curveTo(16.81f, 12.0f, 16.2208f, 11.5826f, 16.0025f, 11.0f)
                horizontalLineTo(19.0025f)
                close()
                moveTo(22.0f, 16.75f)
                verticalLineTo(11.0f)
                lineTo(20.0667f, 11.0f)
                lineTo(19.9352f, 11.3509f)
                curveTo(19.5649f, 12.339f, 18.5919f, 13.0f, 17.4988f, 13.0f)
                curveTo(16.6842f, 13.0f, 15.9362f, 12.6329f, 15.4548f, 12.0368f)
                lineTo(12.348f, 13.6644f)
                curveTo(12.13f, 13.7785f, 11.87f, 13.7785f, 11.652f, 13.6644f)
                lineTo(2.0f, 8.608f)
                verticalLineTo(16.75f)
                lineTo(2.0051f, 16.9344f)
                curveTo(2.1007f, 18.6435f, 3.517f, 20.0f, 5.25f, 20.0f)
                horizontalLineTo(18.75f)
                lineTo(18.9344f, 19.9949f)
                curveTo(20.6435f, 19.8992f, 22.0f, 18.483f, 22.0f, 16.75f)
                close()
                moveTo(12.0f, 12.1533f)
                lineTo(14.2017f, 11.0f)
                lineTo(12.966f, 11.0f)
                curveTo(12.7845f, 11.0f, 12.6108f, 11.0f, 12.4709f, 10.9927f)
                curveTo(12.3549f, 10.9866f, 12.1027f, 10.9724f, 11.8585f, 10.8576f)
                curveTo(11.1134f, 10.5074f, 10.7897f, 9.6221f, 11.1333f, 8.874f)
                curveTo(11.246f, 8.6287f, 11.4294f, 8.4552f, 11.5142f, 8.3757f)
                curveTo(11.6164f, 8.2799f, 11.7491f, 8.1679f, 11.8878f, 8.0508f)
                lineTo(12.4986f, 7.5354f)
                lineTo(12.4988f, 5.0f)
                curveTo(12.4988f, 4.6575f, 12.5333f, 4.3231f, 12.5989f, 4.0f)
                horizontalLineTo(5.25f)
                lineTo(5.0641f, 4.0052f)
                curveTo(3.4643f, 4.0954f, 2.1739f, 5.3427f, 2.0162f, 6.9236f)
                lineTo(12.0f, 12.1533f)
                close()
            }
        }
        .build()
        return _mailAlert!!
    }

private var _mailAlert: ImageVector? = null
