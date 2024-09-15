package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.SmileBeam: ImageVector
    get() {
        if (_smileBeam != null) {
            return _smileBeam!!
        }
        _smileBeam = Builder(name = "SmileBeam", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.0f, 12.0f)
                curveTo(8.906f, 12.0f, 7.391f, 13.207f, 7.391f, 13.207f)
                lineTo(8.609f, 14.793f)
                curveTo(8.609f, 14.793f, 9.693f, 14.0f, 11.002f, 14.0f)
                curveTo(12.311f, 14.0f, 13.393f, 14.793f, 13.393f, 14.793f)
                lineTo(14.611f, 13.207f)
                curveTo(14.609f, 13.207f, 13.094f, 12.0f, 11.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveTo(18.906f, 12.0f, 17.391f, 13.207f, 17.391f, 13.207f)
                lineTo(18.609f, 14.793f)
                curveTo(18.609f, 14.793f, 19.693f, 14.0f, 21.002f, 14.0f)
                curveTo(22.311f, 14.0f, 23.393f, 14.793f, 23.393f, 14.793f)
                lineTo(24.611f, 13.207f)
                curveTo(24.609f, 13.207f, 23.094f, 12.0f, 21.0f, 12.0f)
                close()
                moveTo(10.811f, 19.0f)
                lineTo(9.09f, 20.0f)
                curveTo(9.264f, 20.299f, 9.455f, 20.585f, 9.664f, 20.857f)
                curveTo(9.873f, 21.13f, 10.101f, 21.389f, 10.342f, 21.633f)
                curveTo(10.824f, 22.12f, 11.368f, 22.546f, 11.961f, 22.896f)
                curveTo(12.257f, 23.072f, 12.564f, 23.229f, 12.883f, 23.365f)
                curveTo(13.202f, 23.502f, 13.532f, 23.617f, 13.871f, 23.711f)
                curveTo(14.21f, 23.805f, 14.559f, 23.877f, 14.914f, 23.926f)
                curveTo(15.269f, 23.974f, 15.631f, 24.0f, 16.0f, 24.0f)
                curveTo(16.369f, 24.0f, 16.731f, 23.974f, 17.086f, 23.926f)
                curveTo(18.862f, 23.682f, 20.452f, 22.85f, 21.658f, 21.633f)
                curveTo(21.899f, 21.389f, 22.127f, 21.13f, 22.336f, 20.857f)
                curveTo(22.545f, 20.585f, 22.736f, 20.299f, 22.91f, 20.0f)
                lineTo(21.189f, 19.0f)
                curveTo(20.279f, 20.566f, 18.696f, 21.689f, 16.82f, 21.945f)
                curveTo(16.552f, 21.982f, 16.279f, 22.0f, 16.0f, 22.0f)
                curveTo(15.721f, 22.0f, 15.448f, 21.982f, 15.18f, 21.945f)
                curveTo(14.912f, 21.909f, 14.649f, 21.854f, 14.395f, 21.783f)
                curveTo(13.885f, 21.642f, 13.403f, 21.435f, 12.959f, 21.172f)
                curveTo(12.515f, 20.909f, 12.107f, 20.59f, 11.746f, 20.225f)
                curveTo(11.566f, 20.042f, 11.397f, 19.847f, 11.24f, 19.643f)
                curveTo(11.084f, 19.438f, 10.941f, 19.224f, 10.811f, 19.0f)
                close()
            }
        }
        .build()
        return _smileBeam!!
    }

private var _smileBeam: ImageVector? = null
