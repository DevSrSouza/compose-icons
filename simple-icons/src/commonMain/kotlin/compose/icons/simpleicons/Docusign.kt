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

public val SimpleIcons.Docusign: VectorAsset
    get() {
        if (_docusign != null) {
            return _docusign!!
        }
        _docusign = VectorAssetBuilder(name = "Docusign", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.517f, 3.31f)
                horizontalLineToRelative(4.966f)
                verticalLineToRelative(6.621f)
                horizontalLineToRelative(3.31f)
                lineTo(12.0f, 16.552f)
                lineTo(6.207f, 9.931f)
                horizontalLineToRelative(3.31f)
                verticalLineTo(3.31f)
                close()
                moveTo(0.0f, 19.034f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(1.655f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-1.655f)
                close()
            }
        }
        .build()
        return _docusign!!
    }

private var _docusign: VectorAsset? = null
