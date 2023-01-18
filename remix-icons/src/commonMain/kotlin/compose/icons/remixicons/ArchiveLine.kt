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

public val RemixIcons.ArchiveLine: ImageVector
    get() {
        if (_archiveLine != null) {
            return _archiveLine!!
        }
        _archiveLine = Builder(name = "ArchiveLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 10.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 4.003f)
                curveTo(2.0f, 3.449f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineToRelative(18.016f)
                arcTo(0.99f, 0.99f, 0.0f, false, true, 22.0f, 4.003f)
                lineTo(22.0f, 10.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(10.001f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, true, -0.993f, 0.999f)
                lineTo(3.993f, 21.0f)
                arcTo(0.996f, 0.996f, 0.0f, false, true, 3.0f, 20.001f)
                lineTo(3.0f, 10.0f)
                close()
                moveTo(19.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                close()
                moveTo(9.0f, 12.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _archiveLine!!
    }

private var _archiveLine: ImageVector? = null
