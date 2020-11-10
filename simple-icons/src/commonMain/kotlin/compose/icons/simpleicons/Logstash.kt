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

public val SimpleIcons.Logstash: VectorAsset
    get() {
        if (_logstash != null) {
            return _logstash!!
        }
        _logstash = VectorAssetBuilder(name = "Logstash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6f, 7.2f)
                lineTo(12.6f, 24.0f)
                curveToRelative(-5.2f, 0.0f, -10.8f, -4.0f, -10.8f, -9.3f)
                lineTo(1.8f, 0.0f)
                horizontalLineToRelative(3.6f)
                curveToRelative(3.8f, 0.0f, 7.2f, 3.4f, 7.2f, 7.2f)
                close()
                moveTo(15.0f, 13.2f)
                lineTo(15.0f, 24.0f)
                horizontalLineToRelative(7.2f)
                lineTo(22.2f, 13.2f)
                close()
            }
        }
        .build()
        return _logstash!!
    }

private var _logstash: VectorAsset? = null
