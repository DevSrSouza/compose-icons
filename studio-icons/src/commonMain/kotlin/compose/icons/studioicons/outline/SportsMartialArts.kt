package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SportsMartialArts: ImageVector
    get() {
        if (_sportsMartialArts != null) {
            return _sportsMartialArts!!
        }
        _sportsMartialArts = Builder(name = "SportsMartialArts", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8f, 2.0f)
                lineToRelative(-8.2f, 6.7f)
                lineToRelative(-1.21f, -1.04f)
                lineToRelative(3.6f, -2.08f)
                lineToRelative(-4.58f, -4.58f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.74f, 2.74f)
                lineToRelative(-5.74f, 3.31f)
                lineToRelative(-1.19f, 4.29f)
                lineToRelative(2.46f, 4.25f)
                lineToRelative(1.73f, -1.0f)
                lineToRelative(-2.03f, -3.52f)
                lineToRelative(0.35f, -1.3f)
                lineToRelative(3.18f, 1.82f)
                lineToRelative(0.5f, 9.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.5f, -10.0f)
                lineToRelative(8.5f, -8.6f)
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
