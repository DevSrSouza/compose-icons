package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons

public val FeatherIcons.Facebook: VectorAsset
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = VectorAssetBuilder(name = "Facebook", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(1.0f, -4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: VectorAsset? = null
