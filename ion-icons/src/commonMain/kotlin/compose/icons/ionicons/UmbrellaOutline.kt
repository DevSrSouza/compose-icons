package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.UmbrellaOutline: ImageVector
    get() {
        if (_umbrellaOutline != null) {
            return _umbrellaOutline!!
        }
        _umbrellaOutline = Builder(name = "UmbrellaOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 272.0f)
                verticalLineTo(432.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(464.0f, 272.0f)
                curveToRelative(0.0f, -114.88f, -93.12f, -208.0f, -208.0f, -208.0f)
                reflectiveCurveTo(48.0f, 157.12f, 48.0f, 272.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(67.88f, 67.88f, 0.0f, false, true, 96.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(78.28f, 78.28f, 0.0f, false, true, 102.31f, -7.27f)
                lineTo(256.0f, 272.0f)
                lineToRelative(9.69f, -7.27f)
                arcTo(78.28f, 78.28f, 0.0f, false, true, 368.0f, 272.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(67.88f, 67.88f, 0.0f, false, true, 96.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 64.0f)
                lineTo(256.0f, 48.0f)
            }
        }
        .build()
        return _umbrellaOutline!!
    }

private var _umbrellaOutline: ImageVector? = null
