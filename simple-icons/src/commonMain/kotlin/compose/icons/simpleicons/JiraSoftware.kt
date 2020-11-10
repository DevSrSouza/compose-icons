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

public val SimpleIcons.JiraSoftware: VectorAsset
    get() {
        if (_jiraSoftware != null) {
            return _jiraSoftware!!
        }
        _jiraSoftware = VectorAssetBuilder(name = "JiraSoftware", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.323f, 11.33f)
                lineTo(13.001f, 1.0f)
                lineTo(12.0f, 0.0f)
                lineTo(4.225f, 7.775f)
                lineTo(0.67f, 11.33f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, false, 0.0f, 1.347f)
                lineToRelative(7.103f, 7.103f)
                lineTo(12.0f, 24.0f)
                lineToRelative(7.771f, -7.771f)
                lineToRelative(0.121f, -0.121f)
                lineToRelative(3.431f, -3.431f)
                arcToRelative(0.945f, 0.945f, 0.0f, false, false, 0.0f, -1.347f)
                close()
                moveTo(12.0f, 15.551f)
                lineTo(8.449f, 12.0f)
                lineTo(12.0f, 8.453f)
                lineTo(15.548f, 12.0f)
                lineTo(12.0f, 15.551f)
                close()
            }
        }
        .build()
        return _jiraSoftware!!
    }

private var _jiraSoftware: VectorAsset? = null
