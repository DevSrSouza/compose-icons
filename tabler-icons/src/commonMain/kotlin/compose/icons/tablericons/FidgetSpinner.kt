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

public val TablerIcons.FidgetSpinner: ImageVector
    get() {
        if (_fidgetSpinner != null) {
            return _fidgetSpinner!!
        }
        _fidgetSpinner = Builder(name = "FidgetSpinner", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 16.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 16.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.001f, 7.464f)
                lineToRelative(0.001f, 0.072f)
                arcToRelative(3.998f, 3.998f, 0.0f, false, true, 1.987f, 3.758f)
                lineToRelative(0.22f, 0.128f)
                arcToRelative(3.978f, 3.978f, 0.0f, false, true, 1.591f, -0.417f)
                lineToRelative(0.2f, -0.005f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -3.994f, 3.77f)
                lineToRelative(-0.28f, -0.16f)
                curveToRelative(-0.522f, 0.25f, -1.108f, 0.39f, -1.726f, 0.39f)
                curveToRelative(-0.619f, 0.0f, -1.205f, -0.14f, -1.728f, -0.391f)
                lineToRelative(-0.279f, 0.16f)
                lineToRelative(0.007f, 0.231f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.212f, -3.579f)
                lineToRelative(0.222f, -0.129f)
                arcToRelative(3.998f, 3.998f, 0.0f, false, true, 1.988f, -3.756f)
                lineToRelative(0.002f, -0.071f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.995f, -3.265f)
                lineToRelative(-0.005f, -0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _fidgetSpinner!!
    }

private var _fidgetSpinner: ImageVector? = null
