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

public val SimpleIcons.Mcafee: ImageVector
    get() {
        if (_mcafee != null) {
            return _mcafee!!
        }
        _mcafee = Builder(name = "Mcafee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.823f)
                lineTo(1.579f, 0.0f)
                verticalLineToRelative(19.177f)
                lineTo(12.0f, 24.0f)
                lineToRelative(10.421f, -4.823f)
                lineTo(22.421f, 0.0f)
                close()
                moveTo(18.172f, 16.449f)
                lineToRelative(-6.143f, 2.843f)
                lineToRelative(-6.144f, -2.843f)
                lineTo(5.885f, 6.689f)
                lineToRelative(6.144f, 2.842f)
                lineToRelative(6.143f, -2.842f)
                close()
            }
        }
        .build()
        return _mcafee!!
    }

private var _mcafee: ImageVector? = null
