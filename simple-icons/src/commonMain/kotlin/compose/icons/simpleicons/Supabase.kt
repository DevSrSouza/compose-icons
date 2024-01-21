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
                moveTo(11.9f, 1.036f)
                curveToRelative(-0.015f, -0.986f, -1.26f, -1.41f, -1.874f, -0.637f)
                lineTo(0.764f, 12.05f)
                curveTo(-0.33f, 13.427f, 0.65f, 15.455f, 2.409f, 15.455f)
                horizontalLineToRelative(9.579f)
                lineToRelative(0.113f, 7.51f)
                curveToRelative(0.014f, 0.985f, 1.259f, 1.408f, 1.873f, 0.636f)
                lineToRelative(9.262f, -11.653f)
                curveToRelative(1.093f, -1.375f, 0.113f, -3.403f, -1.645f, -3.403f)
                horizontalLineToRelative(-9.642f)
                close()
            }
        }
        .build()
        return _supabase!!
    }

private var _supabase: ImageVector? = null
