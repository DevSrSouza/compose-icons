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

public val RemixIcons.Folder5Fill: ImageVector
    get() {
        if (_folder5Fill != null) {
            return _folder5Fill!!
        }
        _folder5Fill = Builder(name = "Folder5Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.414f, 5.0f)
                horizontalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.414f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(3.087f, 9.0f)
                horizontalLineToRelative(17.826f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.997f, 1.083f)
                lineToRelative(-0.834f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.996f, 0.917f)
                horizontalLineTo(3.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.996f, -0.917f)
                lineToRelative(-0.834f, -10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.087f, 9.0f)
                close()
            }
        }
        .build()
        return _folder5Fill!!
    }

private var _folder5Fill: ImageVector? = null
