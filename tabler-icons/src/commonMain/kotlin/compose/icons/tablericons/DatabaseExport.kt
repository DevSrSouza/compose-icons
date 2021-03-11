package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.DatabaseExport: ImageVector
    get() {
        if (_databaseExport != null) {
            return _databaseExport!!
        }
        _databaseExport = Builder(name = "DatabaseExport", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                arcToRelative(8.0f, 3.0f, 0.0f, true, false, 16.0f, 0.0f)
                arcToRelative(8.0f, 3.0f, 0.0f, true, false, -16.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.657f, 3.582f, 3.0f, 8.0f, 3.0f)
                arcToRelative(19.84f, 19.84f, 0.0f, false, false, 3.302f, -0.267f)
                moveToRelative(4.698f, -2.733f)
                verticalLineToRelative(-6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.599f, 3.335f, 2.905f, 7.538f, 2.995f)
                moveToRelative(8.462f, -6.995f)
                verticalLineToRelative(-2.0f)
                moveToRelative(-6.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                moveToRelative(-3.0f, -3.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-3.0f, 3.0f)
            }
        }
        .build()
        return _databaseExport!!
    }

private var _databaseExport: ImageVector? = null
