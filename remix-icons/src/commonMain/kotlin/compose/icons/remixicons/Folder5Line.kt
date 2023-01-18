package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Folder5Line: ImageVector
    get() {
        if (_folder5Line != null) {
            return _folder5Line!!
        }
        _folder5Line = Builder(name = "Folder5Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.087f, 9.0f)
                horizontalLineToRelative(17.826f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.997f, 1.083f)
                lineToRelative(-0.834f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.996f, 0.917f)
                lineTo(3.92f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.996f, -0.917f)
                lineToRelative(-0.834f, -10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.087f, 9.0f)
                close()
                moveTo(4.84f, 19.0f)
                horizontalLineToRelative(14.32f)
                lineToRelative(0.666f, -8.0f)
                lineTo(4.174f, 11.0f)
                lineToRelative(0.666f, 8.0f)
                close()
                moveTo(13.414f, 5.0f)
                lineTo(20.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.414f)
                lineToRelative(2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _folder5Line!!
    }

private var _folder5Line: ImageVector? = null
