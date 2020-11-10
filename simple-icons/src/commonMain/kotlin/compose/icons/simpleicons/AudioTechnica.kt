package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.AudioTechnica: VectorAsset
    get() {
        if (_audioTechnica != null) {
            return _audioTechnica!!
        }
        _audioTechnica = VectorAssetBuilder(name = "AudioTechnica", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0076f, 12.0076f, 0.0f, false, false, 0.0f, 12.0f)
                arcTo(12.0341f, 12.0341f, 0.0f, false, false, 12.0f, 24.0303f)
                arcTo(12.0341f, 12.0341f, 0.0f, false, false, 24.0f, 12.0f)
                arcTo(12.0076f, 12.0076f, 0.0f, false, false, 12.0038f, 0.0f)
                close()
                moveTo(12.0f, 0.9044f)
                arcTo(11.0918f, 11.0918f, 0.0f, false, true, 23.0993f, 11.9962f)
                curveToRelative(0.0f, 6.1306f, -4.965f, 11.1258f, -11.0993f, 11.1258f)
                arcTo(11.1183f, 11.1183f, 0.0f, false, true, 0.9082f, 12.0f)
                arcTo(11.0918f, 11.0918f, 0.0f, false, true, 11.9962f, 0.9082f)
                close()
                moveTo(12.087f, 2.0662f)
                lineTo(11.6556f, 3.3188f)
                lineTo(5.9754f, 19.4021f)
                lineTo(5.7711f, 20.0076f)
                lineTo(18.4409f, 20.0076f)
                lineTo(18.21f, 19.4021f)
                lineTo(12.526f, 3.315f)
                close()
                moveTo(12.087f, 4.8666f)
                lineTo(14.0965f, 10.5166f)
                lineTo(11.0691f, 19.0804f)
                lineTo(7.0501f, 19.0804f)
                close()
                moveTo(14.5922f, 11.913f)
                lineTo(17.1277f, 19.0766f)
                horizontalLineToRelative(-5.0974f)
                close()
            }
        }
        .build()
        return _audioTechnica!!
    }

private var _audioTechnica: VectorAsset? = null
