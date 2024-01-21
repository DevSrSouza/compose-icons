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

public val TablerIcons.NeedleThread: ImageVector
    get() {
        if (_needleThread != null) {
            return _needleThread!!
        }
        _needleThread = Builder(name = "NeedleThread", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                curveToRelative(-0.667f, -0.667f, 3.262f, -6.236f, 11.785f, -16.709f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 5.078f, 4.791f)
                curveToRelative(-10.575f, 8.612f, -16.196f, 12.585f, -16.863f, 11.918f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 6.5f)
                lineToRelative(-1.0f, 1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                curveToRelative(-2.333f, -2.667f, -3.5f, -4.0f, -5.0f, -4.0f)
                reflectiveCurveToRelative(-2.0f, 1.0f, -2.0f, 2.0f)
                curveToRelative(0.0f, 4.0f, 8.161f, 8.406f, 6.0f, 11.0f)
                curveToRelative(-1.056f, 1.268f, -3.363f, 1.285f, -5.75f, 0.808f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.739f, 15.425f)
                curveToRelative(-1.393f, -0.565f, -3.739f, -1.925f, -3.739f, -3.425f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 9.5f)
                lineToRelative(1.5f, 1.5f)
            }
        }
        .build()
        return _needleThread!!
    }

private var _needleThread: ImageVector? = null
