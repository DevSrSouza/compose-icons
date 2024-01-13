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

public val SimpleIcons.Googlehome: ImageVector
    get() {
        if (_googlehome != null) {
            return _googlehome!!
        }
        _googlehome = Builder(name = "Googlehome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, -0.947f, 0.399f)
                lineTo(0.547f, 10.762f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, false, -0.342f, 0.808f)
                verticalLineToRelative(11.138f)
                curveToRelative(0.0f, 0.768f, 0.53f, 1.292f, 1.311f, 1.292f)
                horizontalLineToRelative(20.968f)
                curveToRelative(0.78f, 0.0f, 1.311f, -0.522f, 1.311f, -1.292f)
                lineTo(23.795f, 11.57f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -0.34f, -0.804f)
                lineTo(15.68f, 3.097f)
                horizontalLineToRelative(-0.001f)
                lineTo(12.947f, 0.4f)
                arcTo(1.454f, 1.454f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 6.727f)
                lineTo(18.552f, 13.183f)
                verticalLineToRelative(5.65f)
                lineTo(5.446f, 18.833f)
                verticalLineToRelative(-5.65f)
                close()
            }
        }
        .build()
        return _googlehome!!
    }

private var _googlehome: ImageVector? = null
