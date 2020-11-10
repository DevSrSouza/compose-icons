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

public val SimpleIcons.Unity: VectorAsset
    get() {
        if (_unity != null) {
            return _unity!!
        }
        _unity = VectorAssetBuilder(name = "Unity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9f, 19.2f)
                lineTo(15.6f, 12.0f)
                lineToRelative(4.3f, -7.2f)
                lineTo(22.0f, 12.0f)
                lineToRelative(-2.1f, 7.2f)
                close()
                moveTo(10.4f, 18.5f)
                lineTo(5.0f, 13.2f)
                horizontalLineToRelative(8.6f)
                lineToRelative(4.3f, 7.2f)
                lineToRelative(-7.5f, -1.9f)
                close()
                moveTo(10.4f, 5.4f)
                lineToRelative(7.5f, -1.9f)
                lineToRelative(-4.3f, 7.2f)
                lineTo(4.9f, 10.7f)
                curveToRelative(0.0f, 0.1f, 5.5f, -5.3f, 5.5f, -5.3f)
                close()
                moveTo(21.4f, -0.0f)
                lineToRelative(-9.8f, 2.5f)
                lineTo(10.1f, 5.0f)
                lineTo(7.2f, 5.0f)
                lineTo(0.0f, 12.0f)
                lineToRelative(7.2f, 7.0f)
                horizontalLineToRelative(2.9f)
                lineToRelative(1.4f, 2.5f)
                lineToRelative(9.8f, 2.5f)
                lineToRelative(2.6f, -9.5f)
                lineToRelative(-1.4f, -2.5f)
                lineTo(24.0f, 9.5f)
                lineTo(21.4f, 0.0f)
                close()
            }
        }
        .build()
        return _unity!!
    }

private var _unity: VectorAsset? = null
