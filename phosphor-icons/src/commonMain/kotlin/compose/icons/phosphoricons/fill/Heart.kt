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

public val FillGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 92.0f)
                curveToRelative(0.0f, 30.6f, -17.7f, 62.0f, -52.6f, 93.4f)
                arcTo(314.3f, 314.3f, 0.0f, false, true, 131.9f, 223.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.8f, 0.0f)
                curveTo(119.8f, 220.6f, 20.0f, 163.9f, 20.0f, 92.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 128.0f, 56.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 236.0f, 92.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
