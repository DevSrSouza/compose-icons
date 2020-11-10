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

public val SimpleIcons.Hp: VectorAsset
    get() {
        if (_hp != null) {
            return _hp!!
        }
        _hp = VectorAssetBuilder(name = "Hp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                horizontalLineToRelative(-0.4f)
                lineToRelative(2.5f, -6.7f)
                horizontalLineToRelative(3.4f)
                curveToRelative(0.6f, 0.0f, 1.2f, -0.5f, 1.4f, -1.0f)
                lineTo(21.6f, 9.0f)
                curveToRelative(0.4f, -1.2f, -0.3f, -2.2f, -1.5f, -2.2f)
                horizontalLineToRelative(-4.7f)
                lineToRelative(-3.9f, 10.8f)
                lineToRelative(-2.2f, 6.1f)
                curveTo(3.9f, 22.4f, 0.0f, 17.7f, 0.0f, 12.0f)
                curveTo(0.0f, 6.5f, 3.7f, 1.9f, 8.8f, 0.4f)
                lineTo(6.5f, 6.8f)
                lineTo(2.6f, 17.3f)
                horizontalLineToRelative(2.5f)
                lineToRelative(3.2f, -8.9f)
                horizontalLineToRelative(1.9f)
                lineTo(7.0f, 17.3f)
                horizontalLineToRelative(2.5f)
                lineToRelative(3.0f, -8.3f)
                curveToRelative(0.4f, -1.2f, -0.2f, -2.2f, -1.5f, -2.2f)
                lineTo(9.0f, 6.8f)
                lineTo(11.5f, 0.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.4f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(19.3f, 8.3f)
                horizontalLineToRelative(-1.9f)
                lineToRelative(-2.7f, 7.3f)
                horizontalLineToRelative(1.9f)
                lineToRelative(2.7f, -7.3f)
                close()
            }
        }
        .build()
        return _hp!!
    }

private var _hp: VectorAsset? = null
