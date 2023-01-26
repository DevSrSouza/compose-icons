package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Spellcheck: ImageVector
    get() {
        if (_spellcheck != null) {
            return _spellcheck!!
        }
        _spellcheck = Builder(name = "Spellcheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.12f, 16.0f)
                curveToRelative(0.69f, 0.0f, 1.15f, -0.69f, 0.9f, -1.32f)
                lineTo(9.77f, 3.87f)
                curveTo(9.56f, 3.34f, 9.06f, 3.0f, 8.5f, 3.0f)
                reflectiveCurveToRelative(-1.06f, 0.34f, -1.27f, 0.87f)
                lineTo(2.98f, 14.68f)
                curveToRelative(-0.25f, 0.63f, 0.22f, 1.32f, 0.9f, 1.32f)
                curveToRelative(0.4f, 0.0f, 0.76f, -0.25f, 0.91f, -0.63f)
                lineTo(5.67f, 13.0f)
                horizontalLineToRelative(5.64f)
                lineToRelative(0.9f, 2.38f)
                curveToRelative(0.15f, 0.37f, 0.51f, 0.62f, 0.91f, 0.62f)
                close()
                moveTo(6.43f, 11.0f)
                lineTo(8.5f, 5.48f)
                lineTo(10.57f, 11.0f)
                lineTo(6.43f, 11.0f)
                close()
                moveTo(20.89f, 12.29f)
                lineToRelative(-7.39f, 7.39f)
                lineToRelative(-2.97f, -2.97f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(3.68f, 3.68f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(8.08f, -8.09f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(-0.38f, -0.39f, -1.02f, -0.39f, -1.4f, -0.01f)
                close()
            }
        }
        .build()
        return _spellcheck!!
    }

private var _spellcheck: ImageVector? = null
