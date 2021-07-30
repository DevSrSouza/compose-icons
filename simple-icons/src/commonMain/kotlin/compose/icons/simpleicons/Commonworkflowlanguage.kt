package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Commonworkflowlanguage: ImageVector
    get() {
        if (_commonworkflowlanguage != null) {
            return _commonworkflowlanguage!!
        }
        _commonworkflowlanguage = Builder(name = "Commonworkflowlanguage", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.905f, 0.0f)
                lineTo(8.571f, 5.4f)
                lineToRelative(0.037f, 0.037f)
                lineToRelative(0.096f, 0.096f)
                lineToRelative(3.586f, 3.395f)
                lineToRelative(-2.24f, 2.252f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(-1.576f, 1.586f)
                lineToRelative(3.737f, 3.766f)
                lineToRelative(-3.735f, 3.803f)
                lineToRelative(0.126f, 0.139f)
                verticalLineToRelative(0.012f)
                lineTo(12.052f, 24.0f)
                lineToRelative(1.608f, -1.64f)
                lineToRelative(-1.98f, -2.034f)
                lineToRelative(3.737f, -3.79f)
                lineToRelative(-1.608f, -1.642f)
                lineToRelative(-0.01f, 0.012f)
                lineToRelative(-2.13f, -2.129f)
                lineToRelative(3.867f, -3.866f)
                lineToRelative(-0.017f, -0.015f)
                lineToRelative(0.016f, -0.016f)
                lineToRelative(-3.641f, -3.524f)
                lineToRelative(3.64f, -3.694f)
                close()
            }
        }
        .build()
        return _commonworkflowlanguage!!
    }

private var _commonworkflowlanguage: ImageVector? = null
