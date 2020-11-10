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

public val SimpleIcons.Zendesk: VectorAsset
    get() {
        if (_zendesk != null) {
            return _zendesk!!
        }
        _zendesk = VectorAssetBuilder(name = "Zendesk", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.085f, 21.095f)
                lineTo(0.0f, 21.095f)
                lineTo(11.085f, 7.712f)
                verticalLineToRelative(13.383f)
                close()
                moveTo(24.0f, 21.095f)
                lineTo(12.915f, 21.095f)
                curveToRelative(0.0f, -3.063f, 2.479f, -5.543f, 5.543f, -5.543f)
                curveToRelative(3.063f, 0.0f, 5.542f, 2.482f, 5.542f, 5.543f)
                close()
                moveTo(12.915f, 16.291f)
                lineTo(12.915f, 2.905f)
                lineTo(24.0f, 2.905f)
                lineTo(12.915f, 16.291f)
                close()
                moveTo(11.085f, 2.905f)
                curveToRelative(0.0f, 3.061f, -2.481f, 5.544f, -5.543f, 5.544f)
                curveTo(2.482f, 8.449f, 0.0f, 5.968f, 0.0f, 2.907f)
                horizontalLineToRelative(11.085f)
                verticalLineToRelative(-0.002f)
                close()
            }
        }
        .build()
        return _zendesk!!
    }

private var _zendesk: VectorAsset? = null
