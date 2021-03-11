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

public val TablerIcons.DatabaseImport: ImageVector
    get() {
        if (_databaseImport != null) {
            return _databaseImport!!
        }
        _databaseImport = Builder(name = "DatabaseImport", defaultWidth = 24.0.dp, defaultHeight =
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
                verticalLineToRelative(8.0f)
                moveToRelative(5.009f, 0.783f)
                curveToRelative(0.924f, 0.14f, 1.933f, 0.217f, 2.991f, 0.217f)
                curveToRelative(4.418f, 0.0f, 8.0f, -1.343f, 8.0f, -3.0f)
                verticalLineToRelative(-6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.252f, 20.987f)
                curveToRelative(0.246f, 0.009f, 0.496f, 0.013f, 0.748f, 0.013f)
                curveToRelative(4.418f, 0.0f, 8.0f, -1.343f, 8.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                moveToRelative(-18.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                moveToRelative(-3.0f, -3.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-3.0f, 3.0f)
            }
        }
        .build()
        return _databaseImport!!
    }

private var _databaseImport: ImageVector? = null
