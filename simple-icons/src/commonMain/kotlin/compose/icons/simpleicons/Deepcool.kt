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

public val SimpleIcons.Deepcool: ImageVector
    get() {
        if (_deepcool != null) {
            return _deepcool!!
        }
        _deepcool = Builder(name = "Deepcool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineToRelative(3.046f)
                lineTo(3.046f, 15.046f)
                lineTo(3.046f, 6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(9.046f, 0.0f)
                lineTo(12.0f, 0.0f)
                verticalLineToRelative(9.046f)
                lineTo(6.092f, 9.046f)
                lineTo(6.092f, 12.0f)
                lineTo(12.0f, 12.0f)
                close()
                moveTo(20.954f, 15.046f)
                lineTo(20.954f, 18.0f)
                horizontalLineToRelative(-5.908f)
                verticalLineToRelative(6.0f)
                lineTo(12.0f, 24.0f)
                verticalLineToRelative(-8.954f)
                horizontalLineToRelative(8.954f)
                close()
            }
        }
        .build()
        return _deepcool!!
    }

private var _deepcool: ImageVector? = null
