package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Supabase: ImageVector
    get() {
        if (_supabase != null) {
            return _supabase!!
        }
        _supabase = Builder(name = "Supabase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.362f, 9.354f)
                horizontalLineTo(12.0f)
                verticalLineTo(0.396f)
                arcToRelative(0.396f, 0.396f, 0.0f, false, false, -0.716f, -0.233f)
                lineTo(2.203f, 12.424f)
                lineToRelative(-0.401f, 0.562f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, 0.836f, 1.659f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(8.959f)
                arcToRelative(0.396f, 0.396f, 0.0f, false, false, 0.716f, 0.233f)
                lineToRelative(9.081f, -12.261f)
                lineToRelative(0.401f, -0.562f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, -0.836f, -1.66f)
                close()
            }
        }
        .build()
        return _supabase!!
    }

private var _supabase: ImageVector? = null
