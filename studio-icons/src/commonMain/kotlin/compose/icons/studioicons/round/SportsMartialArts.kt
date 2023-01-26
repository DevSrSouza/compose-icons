package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SportsMartialArts: ImageVector
    get() {
        if (_sportsMartialArts != null) {
            return _sportsMartialArts!!
        }
        _sportsMartialArts = Builder(name = "SportsMartialArts", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.06f, 2.6f)
                lineTo(11.6f, 8.7f)
                lineToRelative(-1.21f, -1.04f)
                lineToRelative(2.48f, -1.43f)
                curveToRelative(0.57f, -0.33f, 0.67f, -1.11f, 0.21f, -1.57f)
                lineToRelative(-2.95f, -2.95f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.03f, 2.03f)
                lineTo(5.35f, 8.26f)
                curveToRelative(-0.23f, 0.13f, -0.39f, 0.35f, -0.46f, 0.6f)
                lineToRelative(-0.96f, 3.49f)
                curveToRelative(-0.07f, 0.26f, -0.04f, 0.53f, 0.1f, 0.77f)
                lineToRelative(1.74f, 3.02f)
                curveToRelative(0.28f, 0.48f, 0.89f, 0.64f, 1.37f, 0.37f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.37f, -1.37f)
                lineToRelative(-1.53f, -2.66f)
                lineToRelative(0.36f, -1.29f)
                lineTo(9.5f, 13.0f)
                lineToRelative(0.44f, 8.0f)
                curveToRelative(0.03f, 0.56f, 0.49f, 1.0f, 1.05f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.56f, 0.0f, 1.02f, -0.44f, 1.05f, -1.0f)
                lineToRelative(0.45f, -9.0f)
                lineToRelative(7.87f, -7.96f)
                curveToRelative(0.36f, -0.36f, 0.38f, -0.93f, 0.05f, -1.32f)
                lineToRelative(0.0f, 0.0f)
                curveTo(20.07f, 2.32f, 19.47f, 2.27f, 19.06f, 2.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
        }
        .build()
        return _sportsMartialArts!!
    }

private var _sportsMartialArts: ImageVector? = null
