package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PeopleArrows: ImageVector
    get() {
        if (_peopleArrows != null) {
            return _peopleArrows!!
        }
        _peopleArrows = Builder(name = "PeopleArrows", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 128.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 32.0f, 64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 96.0f, 128.0f)
                close()
                moveTo(96.0f, 304.08f)
                arcToRelative(44.11f, 44.11f, 0.0f, false, true, 13.64f, -32.0f)
                lineTo(181.77f, 204.0f)
                curveToRelative(1.65f, -1.55f, 3.77f, -2.31f, 5.61f, -3.57f)
                arcTo(63.91f, 63.91f, 0.0f, false, false, 128.0f, 160.0f)
                lineTo(64.0f, 160.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 0.0f, 224.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(32.0f, 480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(160.0f, 383.61f)
                lineToRelative(-50.36f, -47.53f)
                arcTo(44.08f, 44.08f, 0.0f, false, true, 96.0f, 304.08f)
                close()
                moveTo(480.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -64.0f, -64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 480.0f, 128.0f)
                close()
                moveTo(512.0f, 160.0f)
                lineTo(448.0f, 160.0f)
                arcToRelative(63.91f, 63.91f, 0.0f, false, false, -59.38f, 40.42f)
                curveToRelative(1.84f, 1.27f, 4.0f, 2.0f, 5.62f, 3.59f)
                lineToRelative(72.12f, 68.06f)
                arcToRelative(44.37f, 44.37f, 0.0f, false, true, 0.0f, 64.0f)
                lineTo(416.0f, 383.62f)
                lineTo(416.0f, 480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(544.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(576.0f, 224.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 512.0f, 160.0f)
                close()
                moveTo(444.4f, 295.34f)
                lineToRelative(-72.12f, -68.06f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 352.0f, 236.0f)
                verticalLineToRelative(36.0f)
                lineTo(224.0f, 272.0f)
                lineTo(224.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.28f, -8.73f)
                lineTo(131.6f, 295.34f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, 0.0f, 17.47f)
                lineToRelative(72.12f, 68.07f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 372.14f)
                lineTo(224.0f, 336.0f)
                lineTo(352.0f, 336.0f)
                verticalLineToRelative(36.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.28f, 8.74f)
                lineToRelative(72.12f, -68.07f)
                arcTo(12.4f, 12.4f, 0.0f, false, false, 444.4f, 295.34f)
                close()
            }
        }
        .build()
        return _peopleArrows!!
    }

private var _peopleArrows: ImageVector? = null
