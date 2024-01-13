package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.DatabaseOff: ImageVector
    get() {
        if (_databaseOff != null) {
            return _databaseOff!!
        }
        _databaseOff = Builder(name = "DatabaseOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.983f, 8.978f)
                curveToRelative(3.955f, -0.182f, 7.017f, -1.446f, 7.017f, -2.978f)
                curveToRelative(0.0f, -1.657f, -3.582f, -3.0f, -8.0f, -3.0f)
                curveToRelative(-1.661f, 0.0f, -3.204f, 0.19f, -4.483f, 0.515f)
                moveToRelative(-2.783f, 1.228f)
                curveToRelative(-0.471f, 0.382f, -0.734f, 0.808f, -0.734f, 1.257f)
                curveToRelative(0.0f, 1.22f, 1.944f, 2.271f, 4.734f, 2.74f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.657f, 3.582f, 3.0f, 8.0f, 3.0f)
                curveToRelative(0.986f, 0.0f, 1.93f, -0.067f, 2.802f, -0.19f)
                moveToRelative(3.187f, -0.82f)
                curveToRelative(1.251f, -0.53f, 2.011f, -1.228f, 2.011f, -1.99f)
                verticalLineToRelative(-6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.657f, 3.582f, 3.0f, 8.0f, 3.0f)
                curveToRelative(3.217f, 0.0f, 5.991f, -0.712f, 7.261f, -1.74f)
                moveToRelative(0.739f, -3.26f)
                verticalLineToRelative(-4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _databaseOff!!
    }

private var _databaseOff: ImageVector? = null
