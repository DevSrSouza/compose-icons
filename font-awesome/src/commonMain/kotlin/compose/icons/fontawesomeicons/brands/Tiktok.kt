package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Tiktok: ImageVector
    get() {
        if (_tiktok != null) {
            return _tiktok!!
        }
        _tiktok = Builder(name = "Tiktok", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 209.91f)
                arcToRelative(210.06f, 210.06f, 0.0f, false, true, -122.77f, -39.25f)
                verticalLineTo(349.38f)
                arcTo(162.55f, 162.55f, 0.0f, true, true, 185.0f, 188.31f)
                verticalLineTo(278.2f)
                arcToRelative(74.62f, 74.62f, 0.0f, true, false, 52.23f, 71.18f)
                verticalLineTo(0.0f)
                lineToRelative(88.0f, 0.0f)
                arcToRelative(121.18f, 121.18f, 0.0f, false, false, 1.86f, 22.17f)
                horizontalLineToRelative(0.0f)
                arcTo(122.18f, 122.18f, 0.0f, false, false, 381.0f, 102.39f)
                arcToRelative(121.43f, 121.43f, 0.0f, false, false, 67.0f, 20.14f)
                close()
            }
        }
        .build()
        return _tiktok!!
    }

private var _tiktok: ImageVector? = null
