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

public val TablerIcons.Hexagon3d: ImageVector
    get() {
        if (_hexagon3d != null) {
            return _hexagon3d!!
        }
        _hexagon3d = Builder(name = "Hexagon3d", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 6.844f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, true, 1.0f, 1.752f)
                verticalLineToRelative(6.555f)
                curveToRelative(0.0f, 0.728f, -0.394f, 1.399f, -1.03f, 1.753f)
                lineToRelative(-6.0f, 3.844f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.942f, 0.0f)
                lineToRelative(-6.0f, -3.844f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, true, -1.029f, -1.752f)
                verticalLineToRelative(-6.556f)
                curveToRelative(0.0f, -0.729f, 0.394f, -1.4f, 1.029f, -1.753f)
                lineToRelative(6.0f, -3.583f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, true, 2.0f, 0.0f)
                lineToRelative(6.0f, 3.584f)
                horizontalLineToRelative(-0.03f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.5f)
                verticalLineToRelative(4.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 7.5f)
                lineToRelative(3.5f, 2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 10.0f)
                lineToRelative(4.0f, -2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.5f)
                verticalLineToRelative(4.5f)
                lineToRelative(-4.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                lineToRelative(4.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.5f)
                lineToRelative(4.0f, -2.5f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-4.0f, -2.5f)
                lineToRelative(-4.0f, 2.5f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _hexagon3d!!
    }

private var _hexagon3d: ImageVector? = null
