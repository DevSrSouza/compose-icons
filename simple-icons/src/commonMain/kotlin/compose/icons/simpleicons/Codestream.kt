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

public val SimpleIcons.Codestream: ImageVector
    get() {
        if (_codestream != null) {
            return _codestream!!
        }
        _codestream = Builder(name = "Codestream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5408f, 18.2457f)
                arcToRelative(6.4596f, 6.4596f, 0.0f, false, true, 0.0f, -12.5804f)
                lineTo(10.5408f, 1.2199f)
                arcTo(0.4315f, 0.4315f, 0.0f, false, false, 9.795f, 0.9261f)
                lineToRelative(-9.36f, 9.9713f)
                arcToRelative(1.61f, 1.61f, 0.0f, false, false, 0.0f, 2.2011f)
                lineToRelative(9.36f, 9.9754f)
                arcToRelative(0.4315f, 0.4315f, 0.0f, false, false, 0.7463f, -0.2954f)
                close()
                moveTo(13.4592f, 18.2457f)
                arcToRelative(6.4596f, 6.4596f, 0.0f, false, false, 0.0f, -12.5804f)
                lineTo(13.4592f, 1.2199f)
                arcToRelative(0.4315f, 0.4315f, 0.0f, false, true, 0.7463f, -0.2938f)
                lineToRelative(9.3596f, 9.9713f)
                arcToRelative(1.61f, 1.61f, 0.0f, false, true, 0.0f, 2.2011f)
                lineToRelative(-9.3596f, 9.9754f)
                arcToRelative(0.4315f, 0.4315f, 0.0f, false, true, -0.7463f, -0.2954f)
                close()
                moveTo(15.7228f, 11.9555f)
                arcToRelative(3.7276f, 3.7307f, 0.0f, false, true, -3.7277f, 3.7307f)
                arcToRelative(3.7276f, 3.7307f, 0.0f, false, true, -3.7276f, -3.7307f)
                arcToRelative(3.7276f, 3.7307f, 0.0f, false, true, 3.7276f, -3.7307f)
                arcToRelative(3.7276f, 3.7307f, 0.0f, false, true, 3.7277f, 3.7307f)
                close()
            }
        }
        .build()
        return _codestream!!
    }

private var _codestream: ImageVector? = null
