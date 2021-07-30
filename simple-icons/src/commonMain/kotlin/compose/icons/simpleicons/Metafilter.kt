package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Metafilter: ImageVector
    get() {
        if (_metafilter != null) {
            return _metafilter!!
        }
        _metafilter = Builder(name = "Metafilter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.548f, 5.26f)
                lineToRelative(-0.87f, 4.894f)
                horizontalLineToRelative(3.558f)
                lineToRelative(-0.519f, 2.83f)
                horizontalLineToRelative(-3.592f)
                lineToRelative(-1.602f, 8.639f)
                horizontalLineToRelative(-2.857f)
                lineToRelative(3.586f, -19.248f)
                lineTo(24.0f, 2.375f)
                lineToRelative(-0.537f, 2.885f)
                horizontalLineToRelative(-4.915f)
                close()
                moveTo(11.217f, 2.376f)
                lineTo(7.19f, 13.472f)
                lineTo(7.19f, 2.376f)
                lineTo(3.581f, 2.376f)
                lineTo(0.0f, 21.624f)
                horizontalLineToRelative(2.452f)
                lineTo(5.198f, 6.728f)
                lineToRelative(-0.251f, 14.896f)
                horizontalLineToRelative(1.421f)
                lineToRelative(5.225f, -14.896f)
                lineToRelative(-2.786f, 14.896f)
                horizontalLineToRelative(2.48f)
                lineToRelative(3.581f, -19.248f)
                horizontalLineToRelative(-3.651f)
                close()
            }
        }
        .build()
        return _metafilter!!
    }

private var _metafilter: ImageVector? = null
