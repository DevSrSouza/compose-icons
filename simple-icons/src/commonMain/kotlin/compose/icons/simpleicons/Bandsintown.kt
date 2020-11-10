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

public val SimpleIcons.Bandsintown: VectorAsset
    get() {
        if (_bandsintown != null) {
            return _bandsintown!!
        }
        _bandsintown = VectorAssetBuilder(name = "Bandsintown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.783f, 0.0f)
                lineTo(24.0f, 0.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-5.217f)
                lineTo(18.783f, 0.0f)
                close()
                moveTo(12.522f, 5.0f)
                horizontalLineToRelative(5.217f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-5.217f)
                lineTo(12.522f, 5.0f)
                close()
                moveTo(6.26f, 5.0f)
                horizontalLineToRelative(5.217f)
                verticalLineToRelative(7.0f)
                lineTo(6.261f, 12.0f)
                lineTo(6.261f, 5.0f)
                close()
                moveTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(5.217f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(13.566f)
                verticalLineToRelative(-1.0f)
                lineTo(6.26f, 18.0f)
                verticalLineToRelative(-5.0f)
                lineTo(24.0f, 13.0f)
                verticalLineToRelative(11.0f)
                close()
            }
        }
        .build()
        return _bandsintown!!
    }

private var _bandsintown: VectorAsset? = null
