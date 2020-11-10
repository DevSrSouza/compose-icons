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

public val SimpleIcons.Eventbrite: VectorAsset
    get() {
        if (_eventbrite != null) {
            return _eventbrite!!
        }
        _eventbrite = VectorAssetBuilder(name = "Eventbrite", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 5.8f)
                curveToRelative(2.7f, -0.6f, 5.3f, 0.5f, 6.8f, 2.5f)
                lineTo(5.6f, 11.0f)
                curveToRelative(0.4f, -2.5f, 2.3f, -4.6f, 4.9f, -5.2f)
                close()
                moveTo(17.4f, 15.6f)
                curveToRelative(-0.9f, 1.3f, -2.3f, 2.3f, -3.9f, 2.6f)
                curveToRelative(-2.7f, 0.6f, -5.3f, -0.5f, -6.8f, -2.6f)
                lineTo(18.4f, 13.0f)
                lineToRelative(1.9f, -0.4f)
                lineToRelative(3.7f, -0.8f)
                curveToRelative(0.0f, -0.8f, -0.1f, -1.6f, -0.3f, -2.3f)
                curveTo(22.2f, 3.0f, 15.8f, -0.9f, 9.3f, 0.6f)
                reflectiveCurveTo(-1.2f, 8.4f, 0.3f, 14.7f)
                reflectiveCurveTo(8.2f, 25.0f, 14.7f, 23.5f)
                curveToRelative(3.8f, -0.9f, 6.8f, -3.4f, 8.2f, -6.6f)
                curveToRelative(0.1f, -0.1f, -5.5f, -1.3f, -5.5f, -1.3f)
                close()
            }
        }
        .build()
        return _eventbrite!!
    }

private var _eventbrite: VectorAsset? = null
