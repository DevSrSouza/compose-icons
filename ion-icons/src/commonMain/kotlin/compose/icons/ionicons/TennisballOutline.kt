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

public val IonIcons.TennisballOutline: ImageVector
    get() {
        if (_tennisballOutline != null) {
            return _tennisballOutline!!
        }
        _tennisballOutline = Builder(name = "TennisballOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-208.0f, 0.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 416.0f, 0.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, -416.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(461.43f, 271.44f)
                curveToRelative(-5.09f, 0.37f, -8.24f, 0.56f, -13.43f, 0.56f)
                curveToRelative(-114.88f, 0.0f, -208.0f, -93.12f, -208.0f, -208.0f)
                curveToRelative(0.0f, -5.37f, 0.2f, -8.69f, 0.6f, -14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(49.65f, 240.56f)
                reflectiveCurveTo(58.84f, 240.0f, 64.0f, 240.0f)
                curveToRelative(114.88f, 0.0f, 208.0f, 93.12f, 208.0f, 208.0f)
                curveToRelative(0.0f, 5.38f, -0.61f, 14.0f, -0.61f, 14.0f)
            }
        }
        .build()
        return _tennisballOutline!!
    }

private var _tennisballOutline: ImageVector? = null
